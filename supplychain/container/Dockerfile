FROM python:3.9-alpine@sha256:0d85a01ef353af1f5661f368cc1254d039a4c836c48a3450b36c007466e57af5
WORKDIR /app
COPY app.py .
RUN pip install --no-cache-dir Flask==2.0.1
EXPOSE 5000
CMD ["python", "app.py"]
