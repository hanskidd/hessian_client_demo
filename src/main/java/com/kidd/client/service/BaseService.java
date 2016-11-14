package com.kidd.client.service;

import com.kidd.api.domain.User;


public interface BaseService {

	public User getUserInfoByIdFromRemote(int id);
}
