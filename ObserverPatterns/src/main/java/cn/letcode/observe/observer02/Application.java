package cn.letcode.observe.observer02;

public class Application {
    public static void main(String[] args) {
        ShopSubject shop = new ShopSubject();
        CustomerOne boy = new CustomerOne(shop, "张三");
        CustomerTwo girl = new CustomerTwo(shop, "韩红");

        shop.setDiscountGoods("Photo数码相机", 23000, 22000);
        shop.setDiscountGoods("小米手机", 2300, 2200);
    }
}
