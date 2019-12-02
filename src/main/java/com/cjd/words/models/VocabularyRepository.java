package com.cjd.words.models;

import org.springframework.data.repository.CrudRepository;

import com.cjd.words.models.Vocabulary;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface VocabularyRepository extends CrudRepository<Vocabulary, Integer> {

}