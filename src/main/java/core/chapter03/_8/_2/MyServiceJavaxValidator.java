package core.chapter03._8._2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Validator;

/**
 * Inject a reference to javax.validation.Validator
 *
 * @author wangpp
 */
@Service
public class MyServiceJavaxValidator {
    @Autowired
    private Validator validator;
}
