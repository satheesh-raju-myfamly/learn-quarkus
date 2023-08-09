package in.myfamly.learn.quarkus;

import in.myfamly.learn.quarkus.grpc.AddRequest;
import in.myfamly.learn.quarkus.grpc.AddResponse;
import in.myfamly.learn.quarkus.grpc.CalculatorApiClient;
import in.myfamly.learn.quarkus.grpc.CalculatorApiGrpc;
import io.quarkus.grpc.GrpcClient;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/calculator")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CalculatorResource {

    @GrpcClient
    CalculatorApiGrpc.CalculatorApiBlockingStub calculator;

    @POST
    public AddResponseDto add(AddRequestDto addRequest) {
        AddResponse response = calculator.add(AddRequest.newBuilder()
                        .setNumber1(addRequest.getNumber1())
                        .setNumber2(addRequest.getNumber2())
                .build());

        return new AddResponseDto(response.getSum());
    }
}
