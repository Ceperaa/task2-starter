package ru.clevertec;

import ru.clevertec.service.Product;
import ru.clevertec.service.ProductServiceImpl;
import ru.clevertec.service.ProductServiceImplService;

/**
 * генерация jar-файла - wsimport -s src/main/java -d bin http://localhost:9090/products?wsdl
 *
 */
public class Main {
    public static void main(String[] args) {
        //логирование HTTP запрос-ответ
        System.setProperty("com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump","true");
        System.setProperty("com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump","true");


        ProductServiceImpl productService = new ProductServiceImplService().getProductServiceImplPort();
        Product prod = productService.add("prod", 10);
        Product byId = productService.findById(1L);
        System.out.println("Add product - " + prod.getName());
        System.out.println("find by id - "+ byId.getName());
    }
}