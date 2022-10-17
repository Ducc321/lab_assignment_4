public class Address {

    private String street;
    private int number;
    private String zipCode;
    private String city;

    public static void main(String[] args) {
    }

    public Address(String street, int number, String zipCode, String city) {
        this.street = street;
        this.number = number;
        this.zipCode = zipCode;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) {
            return true;
        }

        if(other != null && this.getClass() == other.getClass()) {
            Address that = (Address) other;
            return this.zipCode.equals(that.zipCode) && this.number == that.number;
        }
        return false;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }
}
