package com.example.copsboot.report.web;


import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.time.ZonedDateTime;
import java.util.Set;

import static com.example.copsboot.util.test.ConstraintViolationSetAssert.assertThat;

public class ReportDescriptionValidatorTest {

    @Test
    public void givenSusoectWordPresent_valid() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        CreateReportParameters parameters = new CreateReportParameters(ZonedDateTime.now(),
                "The suspect was wearing a black hat.");
        Set<ConstraintViolation<CreateReportParameters>> violationSet = validator.validate(parameters);
        assertThat(violationSet).hasNoViolations();
    }
}
