public class AddressBook{
    private long phoneNumber;
    private Address tempAddress=new Address();
    private Address permAddress=new Address();
    public void setPhoneNumber(long phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public long getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setTempAddress(Address tempAddress){
        this.tempAddress=tempAddress;
    }
    public Address getTempAddress(){
        return this.tempAddress;
    }
    public void setPermAddress(Address permAddress){
        this.permAddress=permAddress;
    }
    public Address getPermAddress(){
        return this.permAddress;
    }
    class Address{
        private String name,street,city,state;
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }
        public void setStreet(String street){
            this.street=street;
        }
        public String getStreet(){
            return this.street;
        }
        public void setCity(String city){
            this.city=city;
        }
        public String getCity(){
            return this.city;
        }
        public void setState(String state){
            this.state=state;
        }
        public String getState(){
            return this.state;
        }
    }
}