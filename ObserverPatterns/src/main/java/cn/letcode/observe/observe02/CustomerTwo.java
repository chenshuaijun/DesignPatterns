package cn.letcode.observe.observe02;

public class CustomerTwo implements Observer {
    Subject subject;
    String personName;
    double oldPrice, newPrice;

    public CustomerTwo(Subject subject, String personName) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.personName = personName;
    }

    @Override
    public void update() {
        if (subject instanceof ShopSubject) {
            oldPrice = ((ShopSubject) subject).getOldPrice();
            newPrice = ((ShopSubject) subject).getNewPrice();

            System.out.println(personName + "只对打折的商品感兴趣！！");
            System.out.println("原价是：" + oldPrice);
            System.out.println("原价是：" + newPrice);
        }
    }
}
