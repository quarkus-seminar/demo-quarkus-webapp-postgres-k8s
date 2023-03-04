package at.htl.leonding.demo.entity.user;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;
import java.util.stream.Collectors;

@Path("/user")
public class UserResource {
    @Inject
    UserRepository userRepository;

    @Inject
    UserMapper userMapper;

    @GET
    public List<UserDto> getUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(
                        user -> userMapper.toResource(user)
                )
                .collect(Collectors.toList());
    }
}

