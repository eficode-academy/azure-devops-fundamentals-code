# repo-name

## How to build (and fast tests)

1. Run the command

```
./gradlew build
```

## How to test

### Fast tests

1. Run the command

```
./gradlew test
```

### Slow tests

1. Run the command

```
./gradlew slowtest
```

## How to run

1. Run the command

```
./gradlew bootRun
```

1. Access `localhost:5000` or `localhost:5000/get?product=XXX` through a browser

## How to deploy

1. First time add the `heroku` remote to git

```
git remote add heroku https://heroku:$(PAT)@git.heroku.com/$(AppName).git
```

1. Then to deploy the current branch use the command

```
git push heroku HEAD:refs/heads/master
```

## How to contribute

1. Create a feature branch
2. Implement change
3. Make sure the tests pass
4. Create a pull request to the `main` branch

