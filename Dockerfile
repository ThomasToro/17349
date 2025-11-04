FROM alpine 
RUN apk add nginx 
#RUN nginx
CMD [ "nginx","-g","daemon off;" ] 
EXPOSE 80
COPY ./40270 /var/lib/nginx/html
COPY ./thomas.conf  /etc/nginx/http.d/default.conf
