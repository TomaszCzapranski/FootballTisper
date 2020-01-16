package com.TMT.model.users;

import com.TMT.model.matches.Api;

public class ApiProfileService {


    private ApiProfile apiProfile;

    public ApiProfileService() {
    }

    public ApiProfileService(ApiProfile apiProfile) {
        this.apiProfile = apiProfile;
    }

    public ApiProfile getApi() {
                return apiProfile;
    }

    public void setApi(ApiProfile apiProfile) {
    this.apiProfile = apiProfile;
}
}
