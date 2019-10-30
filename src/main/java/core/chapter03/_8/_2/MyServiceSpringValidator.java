package core.chapter03._8._2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Validator;

/**
 * @author wangpp
 */
@Service
public class MyServiceSpringValidator {
    @Autowired
    public Validator validator;
}
