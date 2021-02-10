package com.lambda.service;

import com.lambda.model.dto.ClientDTO;

import javax.servlet.http.Cookie;
import java.util.List;

public interface ClientService {

    List<ClientDTO> findAll();

    ClientDTO findById(String id);

    void create(ClientDTO clientDetails);

    void update(ClientDTO clientDetails);

    void updateSecret(String clientId, String clientSecret);

    void deleteById(String id);

    Cookie createCookie(ClientDTO clientDTO);

    void patchCookieToForm(String cookie, ClientDTO clientDTO);
}
