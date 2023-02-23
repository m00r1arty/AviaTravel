package com.radzhabov.aviatravel.Resource

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader


class ResourceHelper {
    companion object {
        fun getJsonDataFromAsset(resourcePath: String): String {
            val result = StringBuilder()

            try {
               ResourceHelper::class.java.getResourceAsStream(resourcePath)?.use { input ->
                   BufferedReader(InputStreamReader(input)).use { reader ->
                       var string: String? = reader.readLine()

                       while (string != null) {
                           result.append(string)
                           string = reader.readLine()
                       }
                   }
               }
            } catch (e: IOException) {
                e.printStackTrace()
            }
            return result.toString()
        }
    }
}