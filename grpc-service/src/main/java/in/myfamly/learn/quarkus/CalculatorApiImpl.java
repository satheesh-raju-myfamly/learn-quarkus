package in.myfamly.learn.quarkus;

import in.myfamly.learn.quarkus.grpc.AddRequest;
import in.myfamly.learn.quarkus.grpc.AddResponse;
import in.myfamly.learn.quarkus.grpc.CalculatorApi;
import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;

@GrpcService
public class CalculatorApiImpl implements CalculatorApi {
    @Override
    public Uni<AddResponse> add(AddRequest request) {
        return Uni.createFrom().item(() ->
                AddResponse.newBuilder().setSum(request.getNumber1() + request.getNumber2()).build());
    }
}
