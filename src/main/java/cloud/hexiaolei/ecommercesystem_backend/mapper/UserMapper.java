package cloud.hexiaolei.ecommercesystem_backend.mapper;

import cloud.hexiaolei.ecommercesystem_backend.dto.UserLoginDTO;
import cloud.hexiaolei.ecommercesystem_backend.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserLoginMapper {
 User login(UserLoginDTO userLoginDTO);
}
