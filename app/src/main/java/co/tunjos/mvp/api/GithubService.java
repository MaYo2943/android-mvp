package co.tunjos.mvp.api;

import java.util.List;

import co.tunjos.mvp.api.model.Repo;
import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Path;


public interface GithubService {

    @GET("users/{username}/repos")
    Single<List<Repo>> getRepos(@Path("username") String username);

    @GET("repos/{owner}/{repo}")
    Single<Repo> getRepo(@Path("owner") String owner, @Path("repo") String repo);
}