
package bth3;

import java.time.LocalDate;

public class BTH3L1 {

  
    public static void main(String[] args) {
        
        Product product1 = new Product("01", "GAO" , 10.0);
        Product product2 = new Product("02", "BÁNH", 20.0);
        Product product3 = new Product("01","SUA",30.0);
        
        Order order = new Order(1, LocalDate.now());
        
        order.addLineItem(product1, 5);
        order.addLineItem(product2, 3);
        order.addLineItem(product3, 2);
        
        double totalCharge = order.calcTotalCharge();
        
        
        System.out.println("HOA DON THU: " + order.getOrderID());
        System.out.println("NGAY XUAT HOA DON: " + order.getOrderDate());
        
        System.out.println("DANH SACH HANG:");
        
        for (OrderDetail lineItems : order.getLineItems()) {
            System.out.println("STT "+" MO TA "+ " DON GIA "+ " SO LUONG " + " THANH TIEN " );
            System.out.println(lineItems.getProduct().getProductID()+"   "+lineItems.getProduct().getDescription()+"    "+lineItems.getProduct().getPrice()+"     "+ lineItems.getQuantity()+"         "+ lineItems.calcTotalPrice()+"VND");
        }
        System.out.println("TONG TIEN: " + totalCharge+"VND");
        }
        
    }

    

