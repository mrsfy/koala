package com.koala.app.client.domain.authentication;

import com.koala.app.client.data.user.Identity;
import com.koala.app.client.data.user.UsersRepository;
import com.koala.app.client.domain.UseCase;
import rx.Observable;

/**
 * Created by mrsfy on 13-Dec-16.
 */
public class LogoutUseCase extends UseCase{
    public LogoutUseCase() {
    }


    @Override
    protected Observable<Void> buildUseCaseObservable() {
        Identity.logout();
        return UsersRepository.getInstance().logout();
    }
}
