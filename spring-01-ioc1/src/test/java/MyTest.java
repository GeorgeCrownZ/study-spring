import com.zc.Service.UserService;
import com.zc.Service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //  用户实际调用的是业务层，Dao层他们不需要接触
        UserService userService = new UserServiceImpl();

        userService.getUser();
    }
}
