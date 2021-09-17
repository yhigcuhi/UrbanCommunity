package com.example.SpringbootGrapQL.Entities.user;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

// required annotation
@Entity
// required annotation. this table name is not Task or task.
//  => ×:select * from Task ○:select * from m_task;
@Table(name = "m_task")
@Data
@NoArgsConstructor // for JPA Constructor
@AllArgsConstructor // for JPA Constructor
public class Task { // Tasks => Task

    // import 間違い ×: import org.springframework.data.annotation.Id; => ○: import javax.persistence.Id;
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY) // m_task_task_id_seq を利用して Generation なので...
    @SequenceGenerator(name = "task_id_generator", sequenceName = "m_task_task_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_id_generator")
    // required annotation. filed name is not taskId, name id task_id
    //  => ×:select taskId from m_task ○:select task_id from m_task
    @Column(name = "task_id", updatable = false)
    private Long taskId;

    @Column
    private String task;

    @Column(name = "created_at")
    private String createdAt;

}
