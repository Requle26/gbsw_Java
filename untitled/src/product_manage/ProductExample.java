package product_manage;

import java.util.Arrays;
import java.util.Comparator;

public class ProductExample {
    static void main(String[] args) {
        Product prod = new Product();
        Product[] products = {
                new Product(1, 1200000, "노트북", 5),
                new Product(2, 80000, "키보드", 12),
                new Product(3, 40000, "마우스", 20),
                new Product(4, 350000, "모니터", 8),
                new Product(5, 100000, "헤드셋", 15),
        };

//        "{productId}\t{name}\t{price}원\t{sales}개"
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(
                    product.productId + "\t" +
                            product.name + "\t" +
                            product.price + "원\t" +
                            product.sales + "개"
            );
        }

        System.out.println();

        int totalSales = 0;
        int amount = 0;
        for (Product product:products) {
            totalSales += product.sales;
            amount += product.getProductSellAmount();
        }
        System.out.println("전체 판매 수량 : " + totalSales + "\n" + "전체 매출 : " + amount);


        System.out.println();


//        [4. 상품 중 판매 수량이 제일 높은 상품의 판매 수량과 매출 출력하기]
//        판매 수량이 제일 많은 상품은 {상품 이름} 입니다.
//        {상품 이름} 상품의 판매 수량은 {판매 수량}개, 매출은 {매출}원 입니다.

        Product maxSalesProduct = null;
        for (Product product : products) {
            if (maxSalesProduct == null || maxSalesProduct.sales < product.sales) {
                maxSalesProduct = product;
            }
        }
        System.out.println("판매 수량이 제일 많은 상품은 " + maxSalesProduct.name + " 입니다.");
        System.out.println(maxSalesProduct.name + "의 판매 수량은 " +
                maxSalesProduct.sales + "개, 매출은 " +
                maxSalesProduct.getProductSellAmount() + "원 입니다."
        );

        System.out.println();

        //        Product maxRevenueProduct = null;
//
//        for (Product product : products) {
//            if (product.sales >= avgSales) {
//                if (maxRevenueProduct == null ||
//                        product.sales * product.price >
//                                maxRevenueProduct.sales * maxRevenueProduct.price) {
//
//                    maxRevenueProduct = product;
//                }
//            }
//        }
//        System.out.println("평균 판매 수량 : " + avgSales + "개");
//        System.out.println("평균 판매 수량 이상인 상품 중 매출이 가장 높은 상품은 " + maxRevenueProduct.name + " 입니다.");
//        System.out.println(maxRevenueProduct.name + " 상품의 판매 수량은 " +
//                maxRevenueProduct.sales + "개, 매출은 " +
//                maxRevenueProduct.sales * maxRevenueProduct.price + "원 입니다."
//        );

//        [5. 평균 판매 수량 이상인 상품 중 매출이 가장 높은 상품 찾기]
//        평균 판매 수량 이상인 상품 중 매출이 가장 높은 상품을 찾아 출력하기

//        평균 판매 수량 : {n}개
//        평균 판매 수량 이상인 상품 중 매출이 가장 높은 상품은 {상품 이름} 입니다.
//        {상품 이름} 상품의 판매 수량은 {판매 수량}개, 매출은 {매출}원 입니다.

        double avgSales = (double) totalSales / products.length;
        Product maxRevenueProduct = null;

        for (Product product : products) {
            if (product.sales >= avgSales) {
                if (maxRevenueProduct == null || maxRevenueProduct.getProductSellAmount() < product.getProductSellAmount()) {
                    maxRevenueProduct = product;
                }
            }
        }
        System.out.println("평균 판매 수량 : " + avgSales + "개");
        System.out.println("평균 판매 수량 이상인 상품 중 매출이 가장 높은 상품은 " + maxRevenueProduct.name + " 입니다.");
        System.out.println(maxRevenueProduct.name + " 상품의 판매 수량은 " +
                maxRevenueProduct.sales + "개, 매출은 " +
                maxSalesProduct.getProductSellAmount() + "원 입니다."
        );

        System.out.println();

//        [6. 전체 매출에서 가장 큰 비중을 차지하는 상품과 매출 비율 출력하기]
//        각 상품의 매출을 계산하고, 전체 매출에서 가장 큰 비중을 차지하는 상품을 찾아 비율과 함계 출력하기
//        비율은 정수형으로 표시

//        전체 매출 : {n}원
//        전체 매출에서 가장 큰 비중을 차지하는 상품은 {상품 이름} 입니다.
//        {상품 이름} 상품의 매출은 {매출}원이며, 전체 매출의 {비율}% 입니다.

        Product maxSellPd = null;
        int amount2 = 0;
        for (Product product : products) {
            if (maxSellPd == null || maxSellPd.getProductSellAmount() < product.getProductSellAmount()) {
                maxSellPd = product;
            }
            amount2 += product.getProductSellAmount();
        }
        System.out.println("전체 매출 " + amount2 + "원");
        System.out.println("전체 매출에서 가장 큰 비중을 차지하는 상품은 " + maxSellPd.name + " 입니다.");
        System.out.println(maxSellPd.name + " 상품의 매출은 " +
                maxSellPd.getProductSellAmount() + "원이며, 전체 매출의 " +
                ((maxSellPd.getProductSellAmount()) / (double) amount2) * 100 + "% 입니다.");

//        [7. 매출이 가장 높은 상품과 두 번째로 높은 상품 찾기]
//        각 상품의 매출(가격 X 판매수량)을 기준으로,
//        매출이 가장 높은 상품과 두 번째로 높은 상품을 찾아 출력하기

//        매출 1위 : {상품 이름} - {매출}원
//        매출 2위 : {상품 이름} - {매출}원

//        매출이 같은 상품이 있는 경우 상품 아이디가 작은 상품을 더 높은 순위로 처리한다

        Product maxSellProduct1 = new Product();
        Product maxSellProduct2 = new Product();


        for (Product product : products) {
//          현재 상품 매출이 1등 매출보다 높은 경우
            if (product.getProductSellAmount() > maxSellProduct1.getProductSellAmount()) {
                maxSellProduct2 = maxSellProduct1;
                maxSellProduct1 = product;
            }
//        현재 상품 매출이 1등 매출부도 낮지만 2등보다 높은 경우
            else if (product.getProductSellAmount() > maxSellProduct2.getProductSellAmount()) {
                maxSellProduct2 = product;
            }
//        현재 상품 매출이 2등보다 낮은 경우 -> 버림
        }
        System.out.println("매출 1위 : " + maxSellProduct1.name + " - " +
                maxSellProduct1.getProductSellAmount() + "원"
        );
        System.out.println("매출 2" +
                "위 : " + maxSellProduct2.name + " - " +
                maxSellProduct2.getProductSellAmount() + "원"
        );

//        Product[] sortedProducts = (Product[]) Arrays.stream(products)
//                .sorted(Comparator.comparingInt(Product::getProductSellAmount)
//                        .reversed()).toArray(());


}}
