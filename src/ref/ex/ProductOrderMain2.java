package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder product1 = creatProductOrder("두부", 2000, 2);
        ProductOrder product2 = creatProductOrder("김치", 5000, 1);
        ProductOrder product3 = creatProductOrder("콜라", 1500, 2);

        ProductOrder[] products = {product1, product2, product3};

        printProductOrder(products);

        int totalAmount = getTotalAmount(products);

        System.out.println("총 결제 금액: " + totalAmount);
    }


    static ProductOrder creatProductOrder(String productName, int price, int quantity) {
        ProductOrder product = new ProductOrder();
        product.productName = productName;
        product.price = price;
        product.quantity = quantity;

        return product;
    }

    static void printProductOrder(ProductOrder[] products) {
        for (ProductOrder product : products) {
            System.out.println("상품명: " + product.productName + ", 가격: " + product.price + ", 수량: " + product.quantity);
        }
    }

     static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;

    }
}

