package com.cdima.tests;

import org.junit.jupiter.api.Test;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

public class ApiTest {

    @Test
    void shouldReturn200AndContainTitle() throws Exception {

        // Arrange
        String endpoint = "https://jsonplaceholder.typicode.com/todos/1";

        // Act
        URL url = new URL(endpoint);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        int statusCode = connection.getResponseCode();

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(connection.getInputStream())
        );

        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();

        String responseBody = response.toString();

        // Assert
        assertEquals(200, statusCode, "Status code should be 200");
        assertTrue(responseBody.contains("title"), "Response should contain title");
        assertFalse(responseBody.isEmpty(), "Response should not be empty");
    }
}
