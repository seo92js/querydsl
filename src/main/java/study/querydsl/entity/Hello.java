package study.querydsl.entity;

import lombok.Getter;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Service
public class Hello {
    @Id @GeneratedValue
    private Long id;
}
