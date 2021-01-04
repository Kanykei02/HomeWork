package com.company;

public class Shop {
    private int price;
    private int weight;

    private int ozonPrice = 20;
    private int ozonSpeed = 5;
    private int ozonTax = 20;
    private int ozonLost = 20;

    private int amazonPrice = 35;
    private int amazonSpeed =14;
    private int amazonTax = 15;
    private int amazonLost=  5;

    private int alibabaPrice = 10;
    private int alibabaSpeed = 9;
    private int alibabaTax = 15;
    private int alibabaLost=  14;

    public Shop() {};

    public Shop(int price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    public String buy() {
        String lost = "";
        if (price >= 10000){
            System.out.println("Стоимость вашего пакета превышает 10000. Мы советуем вам использовать Amazon. У них более низкий уровень потерь, но более высокая цена и более высокая скорость доставки.");
            double price2 = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            lost = String.format("Ваш заказ прибудет в пункт назначения примерно через %s дней. Стоимость составит %s ( %s плюс %s налог плюс стоимость доставки.", amazonSpeed, price2, price, amazonTax);
        }
        else if (weight >= 5 && price <= 2000) {
            double finalPrice = ((alibabaTax * 0.01 * this.price) + this.price + (alibabaPrice * this.weight));
            System.out.println("Ваша посылка довольно тяжелая. Мы советуем вам использовать Alibaba из-за более низкой стоимости пакета. Однако вам придется подождать еще немного.");
            lost = String.format("Ваш заказ прибудет в пункт назначения примерно через %s дней. Стоимость составит %s ( %s плюс %s налог плюс стоимость доставки.)",alibabaSpeed, finalPrice, price, alibabaTax);}
        else {
            System.out.println("У вас небольшой пакет. Мы советуем вам использовать Ozon из-за его быстрой доставки и низких затрат.");
            double finalPrice = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            lost = String.format("Ваш заказ прибудет в пункт назначения примерно через %s дней. Стоимость составит %s ( %s плюс %s налог плюс стоимость доставки)",ozonSpeed, finalPrice, price, ozonTax);
        }
        return lost;
    }

    public String order() {
        String delivery = "";
        if (price >= 10000) {
            System.out.println("Стоимость вашего пакета превышает 10000. Мы советуем вам использовать Amazon. У них более низкий уровень потерь, но более высокая цена и более высокая скорость доставки.");
            double finalPrice = ((amazonTax * 0.01 * this.price) + this.price + (amazonPrice * this.weight));
            delivery = String.format("Ваш заказ будет доставлен примерно через %s дней. Стоимость составляет около %s ( %s плюс %s налог плюс стоимость доставки)", amazonSpeed, finalPrice, price, amazonTax);
        }
        else if (weight >= 5 && price <= 2000) {
            double finalPrice = ((alibabaTax * 0.01 * this.price) + this.price + (alibabaPrice * this.weight));
            System.out.println("Ваша посылка довольно тяжелая. Мы советуем вам использовать Alibaba из-за более низкой стоимости пакета. Однако вам придется подождать еще немного.");
            delivery = String.format("Ваш заказ будет доставлен примерно через %s дней. Стоимость составляет около %s ( %s плюс %s налог плюс стоимость доставки)", alibabaSpeed, finalPrice, price, alibabaTax);}
        else {
            System.out.println("У вас небольшой пакет. Мы советуем вам использовать Ozon из-за его быстрой доставки и низких затрат.");
            double finalPrice = ((ozonTax * 0.01 * this.price) + this.price + (ozonPrice * this.weight));
            delivery = String.format("Ваш заказ будет доставлен примерно через %s дней. Стоимость составляет около %s ( %s плюс %s налог плюс стоимость доставки)", ozonSpeed, finalPrice, price, ozonTax);
        }
        return delivery;
    }
}
