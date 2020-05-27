package kr.re.kitri.hello.model;

public class Product {
    /*
     Product라는 테이블이 있다면 그 테이블의 컬럼명과 맞추는것도 좋은 방법이다.
     어설픈 약어는 쓰지 말것.
     sulgye 이런식의 콩글리시는 금물.
     */
    private String productId;
    private String name;
    private long price; //int는 ±20억까지 한계가 있어서 long타입이 점점 각광받는 편
    private String description;

    public Product() {}

    public Product(String productId, String name, long price, String description) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
