package belajar.ojak.data;

/**
 * @author Abdul Rozak
 * @since 2/4/21
 */
class SocialMedia {
    String name;
}

class Facebook extends SocialMedia {

    final void login(String username, String password){

    }
}

class FakeFacebook extends Facebook {

//    void login(String username, String password){ //error: cannot inherit from final method
//
//    }
}