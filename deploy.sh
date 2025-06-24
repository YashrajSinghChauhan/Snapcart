#!/bin/bash
set -e

APP_NAME="snapcart-app"

echo "🔧 Checking Docker..."
if ! command -v docker &> /dev/null; then
  echo "🔍 Docker not found. Installing..."
  curl -fsSL https://get.docker.com -o get-docker.sh
  sudo sh get-docker.sh
  sudo usermod -aG docker $USER
  echo "✅ Docker installed. Please logout and login again if it's the first time."
else
  echo "✅ Docker is already installed."
fi

echo "🔧 Checking Docker Compose..."
if ! command -v docker-compose &> /dev/null && ! docker compose version &> /dev/null; then
  echo "Docker Compose not found. Installing..."
  # Docker Compose v2 is included with Docker, but in case it's missing, install docker-compose plugin
  sudo curl -L "https://github.com/docker/compose/releases/latest/download/docker-compose-$(uname -s)-$(uname -m)" \
    -o /usr/local/bin/docker-compose
  sudo chmod +x /usr/local/bin/docker-compose
  echo "✅ Docker Compose installed."
else
  echo "✅ Docker Compose is already installed."
fi

echo "🧹 Cleaning previous containers and volumes (if any)..."
docker compose down --volumes || true

echo "🚢 Building and running with Docker Compose..."
docker compose build
docker compose up -d

echo "✅ Done! Application running at http://<your-ec2-ip>:8080"
