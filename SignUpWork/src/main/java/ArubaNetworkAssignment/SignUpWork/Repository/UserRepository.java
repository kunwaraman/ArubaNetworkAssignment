package ArubaNetworkAssignment.SignUpWork.Repository;

import ArubaNetworkAssignment.SignUpWork.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {


}
