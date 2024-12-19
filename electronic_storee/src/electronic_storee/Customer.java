
package electronic_storee;


public class Customer {
    private Integer id;
    private String name;
    private String address;
    private Integer password;

    public Customer(Integer id, String name, String address, Integer password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }
    
}
