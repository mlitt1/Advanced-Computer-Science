public class BobaShop {
    
    private String shopName;
    private BobaShopMember[] registeredMembers;
    
    public BobaShop(String shopName, BobaShopMember[] registeredMembers) {
        this.shopName = shopName;
        this.registeredMembers = registeredMembers;
    }

    public BobaShop(String shopName, int initialCapacity) {
        this.shopName = shopName;
        boolean[] BobaShopMember = null;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public BobaShopMember[] getRegisteredMembers() {
        return registeredMembers;
    }

    public void setRegisteredMembers(BobaShopMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void biggerArray(BobaShop other) {
        
        if (this.registeredMembers.length == this.registeredMembers.length) {
            int biggerArray = this.registeredMembers.length + 1;
            BobaShopMember[] newArray = new BobaShopMember[biggerArray];

            for (int i = 0; i < this.registeredMembers.length; i++) {
                newArray[i] = this.registeredMembers[i];
            }

            this.registeredMembers = newArray;
        }   
    }

    public void registerMember() {
        boolean[] newMember;
        // registeredMembers = registeredMembers.length + newMember.length;
    }
    
    public String toString() {
        // String toString = "==" + shopName + " ==\n 1.) " + BobaShopMember.toString() + "\n2.) " + BobaShopMember.toString().other;
        // return toString;
        return "";
        
    }

    public void smallerArray(BobaShop other) {
        
        if (this.registeredMembers.length == this.registeredMembers.length) {
            int biggerArray = this.registeredMembers.length - 1;
            BobaShopMember[] newArray = new BobaShopMember[biggerArray];

            for (int i = 0; i < this.registeredMembers.length; i++) {
                newArray[i] = this.registeredMembers[i];
            }

            this.registeredMembers = newArray;
        }   

    }
}
