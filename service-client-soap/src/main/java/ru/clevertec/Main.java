package ru.clevertec;

import javax.xml.ws.Endpoint;
import java.util.Scanner;

/**
 * Создание веб сервиса
 * SEI – Service Endpoint Interface
 * Bottom-up
 * • java implementation —> WSDL
 * • Создать SEI
 * • Запустить на выполнение SEI
 * • Получить WSDL
 * • Создать (сгенерировать) клиент
 */
public class Main {

    private static final Object SERVICE_IMPL = new ru.clevertec.service.ProductServiceImpl();
    private static final String SERVICE_ADDRESS = "http://localhost:9090/products";

    public static void main(String[] args) {

        Endpoint productEp = Endpoint.publish(SERVICE_ADDRESS, SERVICE_IMPL);

        System.out.println("Hello from client! " + SERVICE_ADDRESS);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();

        productEp.stop();
        System.out.println("service stoped");
    }
}