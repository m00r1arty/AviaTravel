package com.radzhabov.aviatravel.data.resource

import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

class ResourceHelper {
    companion object {
        fun getJsonDataFromAsset(resourcePath: String): String {
            return StringBuilder().apply {
                try {
                    ResourceHelper::class.java.getResourceAsStream(resourcePath)?.use { input ->
                        BufferedReader(InputStreamReader(input)).use { reader ->
                            var string: String? = reader.readLine()
                            while (string != null) {
                                append(string)
                                string = reader.readLine()
                            }
                        }
                    }
                } catch (e: IOException) {
                    e.printStackTrace()
                }
            }.toString()
        }
    }
}