

import firebase from '@react-native-firebase/app';
import '@react-native-firebase/auth';

const firebaseConfig = {
    clientId: 'fir-auth-52f6d',
    appId: 'fir-auth-52f6d',
    apiKey: 'AIzaSyAuDOQyN8EkO9jvJr-FfzZKxHWX1DaxQuw',
    databaseURL: 'https://fir-auth-52f6d-default-rtdb.firebaseio.com/',
    storageBucket: 'gs://fir-auth-52f6d.appspot.com',
    projectId: 'fir-auth-52f6d',
}

firebase.initializeApp(firebaseConfig);

const auth = firebase.auth();

export { firebase, auth };