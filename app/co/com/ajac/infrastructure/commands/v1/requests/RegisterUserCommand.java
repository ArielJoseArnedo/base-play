package co.com.ajac.infrastructure.commands.v1.requests;

import co.com.ajac.base.errors.AppError;
import co.com.ajac.base.events.Event;
import co.com.ajac.concurrency.FutureEither;
import co.com.ajac.infrastructure.api.commands.Command;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.collection.List;
import io.vavr.control.Option;

public class RegisterUserCommand implements Command<RegisterUserResponse, RegisterUserRequest> {

    @Override
    public FutureEither<AppError, Tuple2<Option<RegisterUserResponse>, List<Event>>> execute(RegisterUserRequest request) {
        final RegisterUserResponse registerUserResponse = new RegisterUserResponse(request.getName());
        return FutureEither.right(Tuple.of(Option.of(registerUserResponse), List.empty()));
    }
}
