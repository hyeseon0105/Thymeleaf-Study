package my.app.first_Project.dto;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;

@Getter
@Setter
@ToString
//@RequiredArgsConstructor
public class UserData {
    private String userName;
    private int userAge;
    private String userAddress;



    //getter,setter,tostring
//    기본생성장,전체생성자,일부생성자

//    @AllArgsConstructor
//
//    public UserData(String userName, int userAge, String userAddress) {
//        this.userName = userName;
//        this.userAge = userAge;
//        this.userAddress = userAddress;
//    }

//    @NoArgsConstructor
//
//    public UserData() {
//    }

//    @RequiredArgsConstructor


//    @Getter
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public int getUserAge() {
//        return userAge;
//    }
//
//    public String getUserAddress() {
//        return userAddress;
//    }

//    @AllArgsConstructor
//    @NoArgsConstructor
//    @RequiredArgsConstructor
//    @Setter
//    @Getter
//    @Data
//    @ToString
//    @EqualsAndHashCode
}