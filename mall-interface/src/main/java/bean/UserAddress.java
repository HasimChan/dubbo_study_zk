package bean;

import java.io.Serializable;

public class UserAddress implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNum;
    private String isDefault;

    public UserAddress() {
    }

    public UserAddress(Integer id, String userAddress, String userId, String consignee, String phoneNum, String isDefault) {
        this.id = id;
        this.userAddress = userAddress;
        this.userId = userId;
        this.consignee = consignee;
        this.phoneNum = phoneNum;
        this.isDefault = isDefault;
    }

    @Override
    public String toString() {
        return "UserAddress{" +
                "id=" + id +
                ", userAddress='" + userAddress + '\'' +
                ", userId='" + userId + '\'' +
                ", consignee='" + consignee + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", isDefault='" + isDefault + '\'' +
                '}';
    }
}
