FROM node:18.16.0-alpine

RUN mkdir /your-business-frontend
WORKDIR /your-business-frontend

COPY /your-business .
WORKDIR your-business

RUN npm install

CMD ["npm", "run", "dev", "--", "--host"]