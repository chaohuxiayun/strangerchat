package com.firedragon.strangerchat.repository;

import com.firedragon.strangerchat.bean.ClientInfo;
import org.springframework.data.repository.CrudRepository;


public interface ClientInfoRepository extends CrudRepository<ClientInfo, String>{
    ClientInfo findClientByclientid(String clientId);
}