package com.vtvpmc.DanasMikelionis.ReactApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.vtvpmc.DanasMikelionis.ReactApp.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    void delete(Contact deleted);
}

