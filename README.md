# boot-db-exporter

> SpringBoot 2.7.0 ver, micrometer 1.9.0 ver


참고 자료
https://acafela.github.io/monitoring/2021/11/28/prometheus-grafana-springboot-1.html



``` 
docker run -it -d -p 3000:3000 grafana/grafana
docker run  -p 9090:9090 -v {prometheus.yml 파일위치}:/etc/prometheus/prometheus.yml -it -d prom/prometheus
``` 
