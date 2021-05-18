Produce the assembly output:
```
sbt assembly
```

and then deploy it as a Cloud Function:
```bash
gcloud functions deploy scala-cf-test \
    --entry-point=com.example.ScalaHelloWorld \
    --runtime=java11 \
    --trigger-http \
    --source=output/
```

To remove the Cloud Function:
```
gcloud functions delete scala-cf-test
```