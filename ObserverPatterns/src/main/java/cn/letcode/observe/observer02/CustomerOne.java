package cn.letcode.observe.observer02;

public class CustomerOne implements Observer {
    Subject subject;
    String goodsName, personName;

    public CustomerOne(Subject subject, String personName) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.personName = personName;
    }

    @Override
    public void update() {
        if (subject instanceof ShopSubject) {
            goodsName = ((ShopSubject) subject).getGoodsName(); // 调用具体的主题中方法
            System.out.println(personName + "只对打折的商品感兴趣！！");
            System.out.println("打折的商品是：" + goodsName);
        }
    }
}
