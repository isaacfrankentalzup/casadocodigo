package br.com.zupedu.casadocodigo.Controller.validator;

import org.hibernate.validator.constraints.CompositionType;
import org.hibernate.validator.constraints.ConstraintComposition;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@ConstraintComposition(CompositionType.OR)
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = {})
@CPF
@CNPJ



public @interface CpfCnpj {
    String message() default "CPF ou CNPJ Inválido";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
