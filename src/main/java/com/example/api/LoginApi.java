package com.example.api;

import com.example.Entity.UserEntity;
import com.example.other.MaisonCommonException;

public interface LoginApi {

    /**
     * ユーザー情報を返す
     * @return ユーザー情報
     * @throws MaisonCommonException
     */
    public UserEntity getUserEntity() throws MaisonCommonException;
}
