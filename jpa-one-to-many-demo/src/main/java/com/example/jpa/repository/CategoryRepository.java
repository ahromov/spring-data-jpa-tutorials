package com.example.jpa.repository;

import com.example.jpa.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 21/11/17.
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
