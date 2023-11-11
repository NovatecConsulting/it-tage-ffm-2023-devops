FROM python:3.6.13-slim-buster
COPY app.py .
RUN pip install --no-cache-dir Flask==2.0.1
EXPOSE 5000
CMD ["python", "app.py"]
