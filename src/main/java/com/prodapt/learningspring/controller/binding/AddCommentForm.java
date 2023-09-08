 
package com.prodapt.learningspring.controller.binding;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class AddCommentForm {

    @NotBlank(message = "Comment content cannot be blank")
    @Size(max = 500, message = "Comment content cannot exceed 500 characters")
    private String content;
 
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
