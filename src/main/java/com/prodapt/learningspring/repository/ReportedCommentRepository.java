 
package com.prodapt.learningspring.repository;

import org.springframework.data.repository.CrudRepository;
import com.prodapt.learningspring.entity.ReportedComment;

public interface ReportedCommentRepository extends CrudRepository<ReportedComment, Long> {
}
