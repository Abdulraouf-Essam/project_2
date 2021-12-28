package com.Collage;

public class Address
{
    private String Country;
    private String City;
    private String Street;
    private String Residential_Building;

    public Address()
    {
        Country = "No Country";
        City = "No City";
        Street = "No street";
        Residential_Building = "No residential_Building";
    }


    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getResidential_Building() {
        return Residential_Building;
    }

    public void setResidential_Building(String residential_Building) {
        Residential_Building = residential_Building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + Country + '\'' +
                ", City='" + City + '\'' +
                ", Street='" + Street + '\'' +
                ", Residential_Building='" + Residential_Building + '\'' +
                '}';
    }
}
